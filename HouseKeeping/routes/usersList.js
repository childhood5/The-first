var mongoose = require('mongoose');
mongoose.connect('mongodb://vn00007:27017/HouseKeeping');
mongoose.model('users',{name:String});


exports.usersList = function(req, res) {
	mongoose.model('users').find(function(err, users) {
		res.render("usersList", {json : users});
	});
};




















