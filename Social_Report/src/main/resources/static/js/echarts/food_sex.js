  // 基于准备好的dom，初始化echarts实例
            var myChart = echarts.init(document.getElementById('pie'));
            // 指定图表的配置项和数据
            myChart.setOption({
    		    title : {
    		        text: '男女吃货比例',//图片名称

    		        x:'center'
    		    },
    		    tooltip : {
    		        trigger: 'item',
    		        formatter: "{a} <br/>{b} : {c} ({d}%)"
    		    },
    		    legend: {
    		        orient: 'vertical',
    		        left: 'left',
    		        data: []//不修改，从数据库调取
    		    },
    		    toolbox: {
                     show : true,
                     feature : {
                             mark : {show: true},
                             dataView : {show: true, readOnly: false},
                             magicType : {
                            show: true,
                            type: ['pie', 'funnel'],
                            option: {
                                funnel: {
                                    x: '25%',
                                    width: '50%',
                                    funnelAlign: 'left',
                                    max: 1548
                                         }
                                      }
                           },
                        restore : {show: true},
                          saveAsImage : {show: true}
                                }
                       },
                calculable : true,
    		    series : [
    		        {
    		            name: '男女吃货比例',
    		            type: 'pie',
    		            radius : '55%',
    		            center: ['50%', '60%'],
    		            data:[],//不修改，从数据库调取
    		            itemStyle: {
    		                emphasis: {
    		                    shadowBlur: 10,
    		                    shadowOffsetX: 0,
    		                    shadowColor: 'rgba(0, 0, 0, 0.5)'
    		                }
    		            }
    		        }
    		    ]
    		});
    		// 异步加载数据
    		var mapOnlyKey = [];
    	    var mapKeyValue = [];
    	    var mapOnlyValue = [];
    		var info = {"opt": "pie"};
    		$.post("./GetPieData", info, function(data){
    		    mapOnlyKey.length=0;
    			mapKeyValue.length=0;
    			mapOnlyValue.length=0;
    			for(var i=0; i < data.length; i++){
    				mapOnlyKey.push( data[i].sex);
                    mapKeyValue.push({"value":Math.round(data[i].num), "name": data[i].sex});
    				mapOnlyValue.push( data[i].num );
    			}
//    		    console.log(mapOnlyKey);
//    		    console.log(mapKeyValue);
//    		    console.log(mapOnlyValue);

    		    // 填入数据
    		    myChart.setOption({
    		        legend: {
    		            //类别
    		            data: mapOnlyKey
    		        },
    		        series: [{
    		            // 根据名字对应到相应的系列
    		            name: '数量',
    		            data: mapKeyValue
    		        }]
    		    });
            // 使用刚指定的配置项和数据显示图表。
    		}, 'json');