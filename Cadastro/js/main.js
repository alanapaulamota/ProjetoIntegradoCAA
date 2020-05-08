const inputs = document.querySelectorAll('.inputs');


function focusFunc(){
	let parent = this.parentNode.parentNode;
	parent.classlist.add('focus')
}

function blurFunc(){
	let parent = this.parentNode.parentNode;
	if (this.value == "") {
		parent.classlist.remove('focus')
	}	
}

inputs.forEach(input => {
	input.addEventListener('focus', focusFunc);
	input.addEventListener('blur', blurFunc);
});