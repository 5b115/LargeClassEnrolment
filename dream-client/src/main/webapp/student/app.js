Ext.Loader.setConfig({
	enabled : true
});
Ext.application({
	name : 'student',
	appFolder : './app',
	controllers : [ 'StudentController' ],
	launch : function() {
		Ext.create('Ext.container.Viewport', {
			layout : 'fit',
			items : [ {
				xtype : 'studentGrid'
			} ]
		});
	}
});
