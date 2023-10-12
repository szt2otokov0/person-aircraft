public class Aircraft {
    private String name;
    private final int maxAmmo;
    private int currentAmmo;
    private int alldamage;
    private final int damage;
    private boolean priority;

    public Aircraft(String name, int maxAmmo, int damage, boolean priority) {
        this.name = name;
        this.maxAmmo = maxAmmo;
        this.damage = damage;
        this.priority = priority;
    }

    public Aircraft(int ammo, int damage) {
        this.name = "an aircraft";
        this.maxAmmo = ammo;
        this.currentAmmo = 0;
        this.damage = damage;
    }

    public int fight(){
        int damageDealt = maxAmmo *damage;
        alldamage += damageDealt;
        currentAmmo = 0;
        return damageDealt;
    }

    public int refillAmmo(int amount){
        int remainingAmmo = maxAmmo-(currentAmmo+amount);
        if(remainingAmmo >= 0){
            currentAmmo += amount;
        }
        return Math.max(remainingAmmo, 0);
    }

    public String getType(){
        return name;
    }

    public String getStatus(){
        return this.toString();
    }

    public boolean isPriority(){
        return priority;
    }

    public String toString(){
        return  "Type " + name +", Ammo: " + currentAmmo + ", Base Damage: " + damage + ", All Damage: " + alldamage;
    }
}
