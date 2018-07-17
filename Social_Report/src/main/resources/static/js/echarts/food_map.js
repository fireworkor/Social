var myChart = echarts.init(document.getElementById('map'));
    	option = {
            title : {
                text: '2011全国GDP（亿元）',
                subtext: '数据来自国家统计局'
            },
            tooltip : {
                trigger: 'item'
            },
            legend: {
                x:'right',
                selectedMode:false,
                data:['北京','上海','广东']
            },
            dataRange: {
                orient: 'horizontal',
                min: 0,
                max: 55000,
                text:['高','低'],           // 文本，默认为数值文本
                splitNumber:0
            },
            toolbox: {
                show : true,
                orient: 'vertical',
                x:'right',
                y:'center',
                feature : {
                    mark : {show: true},
                    dataView : {show: true, readOnly: false}
                }
            },
            series : [
                {
                    name: '2011全国GDP分布',
                    type: 'map',
                    mapType: 'china',
                    mapLocation: {
                        x: 'left'
                    },
                    selectedMode : 'multiple',
                    itemStyle:{
                        normal:{label:{show:true}},
                        emphasis:{label:{show:true}}
                    },
                    data:[
                                         {name:'西藏', value:605.83},{name:'宁夏', value:2102.21}]
                },
                {
                    name:'2011全国GDP对比',
                    type:'pie',
                    roseType : 'area',
                    tooltip: {
                        trigger: 'item',
                        formatter: "{a} <br/>{b} : {c} ({d}%)"
                    },
                    radius: [30, 120],
                    data:[
                        {name: '北京', value: 16251.93},
                        {name: '上海', value: 19195.69},
                        {name: '广东', value: 53210.28}
                    ]
                }
            ],
            animation: false
        };
    	myChart.setOption(option);
    	var info = {
    		"opt" : "map"
    	};
    	var OnlyKey1 = [];
        var KeyValue1 = [];
        var OnlyValue1  = [];
        $.ajax({
            uri: "./GetFoodMapData",
            async: false,
            success: function(data){
            console.log(myChart)
                OnlyKey1.length=0;
                    			KeyValue1.length=0;
                    			 OnlyValue1.length=0;
                    	        for(var i=0; i < data.length; i++){
                            				OnlyKey1.push( data[i].province);
                                            KeyValue1.push({"value":Math.round(data[i].num), "name": data[i].province});
                            				OnlyValue1.push(data[i].num);
                            			}
                            		console.log(KeyValue1)
                            		myChart.setOption({
                            		    series: [{
                            		        data: [
                            		            {name:'西藏',value:1111}
                            		        ]
                            		    }]
                            		});
            }
        })
/*
    	$.post("./GetFoodMapData", function(data) {
    	    console.log(data)

                OnlyKey1.length=0;
    			KeyValue1.length=0;
    			 OnlyValue1.length=0;
    	        for(var i=0; i < data.length; i++){
            				OnlyKey1.push( data[i].province);
                            KeyValue1.push({"value":Math.round(data[i].num), "name": data[i].province});
            				OnlyValue1.push(data[i].num);
            			}
            		console.log(KeyValue1)
            		myChart.setOption({
            		    series: [{
            		        data: [
            		            {name:'西藏',value:1111}
            		        ]
            		    }]
            		});
    	});
*/
