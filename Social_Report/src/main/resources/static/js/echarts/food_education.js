 // 基于准备好的dom，初始化echarts实例
            var myChart1 = echarts.init(document.getElementById('bar'));
            // 指定图表的配置项和数据
            myChart1.setOption({
            	title : {
    		        text: '学历情况',

    		        x:'center'
    		    },
    		    backgroundColor: '#fff',
    		    legend: {
    		        data: [],
    		        align: 'left',
    		        left: 10
    		    },
    		    toolbox: {},
    		    tooltip: {},
    		    xAxis: {
    		        data: [],
    		        name: '学校',
    		        silent: false,
    		        axisLine: {onZero: true},
    		        splitLine: {show: false},
    		        splitArea: {show: false}
    		    },
    		    yAxis: {
    		        name: '人数',
    		        inverse: false,
    		        splitArea: {show: false}
    		    },
    		    grid: {
    		        left: 100
    		    },
    		    series: [
    		        {
    		            name: 'bar',
    		            type: 'bar',
    		            stack: 'one',
    		            data: []
    		        }
    		    ]
    		});

    		// 异步加载数据
    		var mapOnlyKey = [];
    	    var mapKeyValue = [];
    	    var mapOnlyValue = [];
    		var info = {"opt": "bar"};
    		$.post("./GetBarData", info, function(data){
    		    mapOnlyKey.length=0;
    			mapKeyValue.length=0;
    			mapOnlyValue.length=0;
    			for(var i=0; i < data.length; i++){
    				mapOnlyKey.push( data[i].education);
    				mapKeyValue.push({"value":Math.round(data[i].num), "name": data[i].education });
    				mapOnlyValue.push( data[i].num );
    			}
//    		    console.log(mapOnlyKey);
//    		    console.log(mapKeyValue);
//    		    console.log(mapOnlyValue);

    		    // 填入数据
    		    myChart1.setOption({
    		        legend: {
    		            //类别
    		            data: mapOnlyKey
    		        },
    		        xAxis : [
    			        {
    			            data : mapOnlyKey
    			        }
    			    ],
    		        series: [{
    		            // 根据名字对应到相应的系列
    		            name: '数量',
    		            data: mapKeyValue
    		        }]
    		    });
            // 使用刚指定的配置项和数据显示图表。
    		}, 'json');
