package characters;

public abstract class Character {

        private int health;

        public Character(int health){
            this.health = health;
        }

        public int getHealth() {
            return health;
        }

        public double setHealth(int newHealth) {
            return health = newHealth;
        }
}

