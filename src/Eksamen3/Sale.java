package Eksamen3;

    public class Sale {
        private int month;
        private int amount;

        public Sale(int month, int amount){
            this.month = month;
            this.amount = amount;
        }

        public int getAmount() {
            return amount;
        }

        public int getMonth(){
            return month;
        }

        @Override
        public String toString(){
            return "Måned " + month + ": " + amount + " kr.";
        }
    }
