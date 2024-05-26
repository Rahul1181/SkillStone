
const init =100;

const arr=[1,2,3,4];

const fn= function(init, arr){
    let value=init;
    for(let i=0;i<arr.length;i++){
        value += arr[i]*arr[i];
    }
    return value;
    
}
var reduce = function(nums, fn, init) {
    let myArr=0;
    if(nums.length==0)
        return init

    for(let i=0;i<nums.length;i++){
       console.log(myArr+=fn(init, nums[i]))
    }
    
    //return myArr;
};
console.log(reduce)

do {
    
} while (condition);