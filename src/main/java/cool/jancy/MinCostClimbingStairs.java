package cool.jancy;

/**
 * @author dengjie
 * @version 1.0
 * @ClassName : MinCostClimbingStairs
 * @description: TODO
 * @date 2024/5/15 上午10:19
 */
public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {
        int minCost0 = 0, minCost1 = 0;
        for (int i = 2; i <= cost.length; i++) {
            int minCost = Math.min(minCost0 + cost[i - 2], minCost1 + cost[i - 1]);
            minCost0 = minCost1;
            minCost1 = minCost;
        }
        return minCost1;
    }
}
