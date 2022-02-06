public class BonusMilesService {
    public int calculate(int cost) {
        int bonus = cost / 100 / 100;
        int limit = 500;
        if (bonus > limit) {
            bonus = limit;
        }
        return bonus;
    }
}
