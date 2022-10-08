class Solution {
public:
    int totalways(int currentStair, int targetStair, unordered_map<int, int> &memo)
    {
        if(currentStair==targetStair){
            return 1;
        }

        if(currentStair > targetStair){
            return 0;
        }
        int currentKey = currentStair;

        if(memo.find(currentKey)!=memo.end()){ 
            return memo[currentKey];
        }
        int oneStep = totalways (currentStair+1, targetStair, memo);
        int twoStep = totalways (currentStair+2, targetStair, memo);

        memo[currentkey] = oneStep+twoStep;

        return oneStep+twoStep;
    }

int climbStairs (int n) {
    unordered_map<int, int> memo;
    return totalways (0,n,memo);
}
};
