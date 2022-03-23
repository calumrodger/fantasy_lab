package enemies;

public abstract class Enemy {

    private String name;
    private int healthBar;
    private int stamina;
    private int criticalChance;

    public Enemy(String name, int healthBar, int stamina, int criticalChance) {
        this.name = name;
        this.healthBar = healthBar;
        this.stamina = stamina;
        this.criticalChance = criticalChance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthBar() {
        return healthBar;
    }

    public void setHealthBar(int healthBar) {
        this.healthBar = healthBar;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getCriticalChance() {
        return criticalChance;
    }

    public void setCriticalChance(int criticalChance) {
        this.criticalChance = criticalChance;
    }

    public void takeDamage(int damage){
        this.healthBar -= damage;
    }

}
