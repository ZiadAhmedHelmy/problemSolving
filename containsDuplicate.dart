class Solution {
  bool containsDuplicate(List<int> nums) {
      Set<int> listClean = {};

      for(var i in nums){
          listClean.add(i);
      }
      if(listClean.length == nums.length){
          return false;
      }
      return true;

  }
}