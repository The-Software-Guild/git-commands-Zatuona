public class FruitsBasket {

        public static void main(String[] args) {
            String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
                    "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
                    "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
                    "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
                    "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
                    "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
                    "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                    "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
                    "Dragonfruit", "Apple", "Orange", "Orange"};

            int numOranges = 0;
            int numApples = 0;
            int numOtherFruit = 0;

            // Fruit counting code goes here!
            for (int i = 0; i < fruitBasket.length; i++){

                if (fruitBasket[i] == "Orange"){
                    numOranges++;

                } else if (fruitBasket[i] == "Apple"){
                    numApples++;

                } else {
                    numOtherFruit++;
                }



            }

            // Print The Results!

            System.out.println("Total number in fruit basket is " + fruitBasket.length);
            System.out.println("There are " + numOranges + " Oranges in here");
            System.out.println("There are " + numApples+ " Apples in here");
            System.out.println("There are " + numOtherFruit + " pieces of other fruit in here");



        }
}

