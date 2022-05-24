package Assignment.DiaryProject;

public class NumberOfBooks {

        private int numberOfBooks;

        public void setNumberOfBooks(int numberOfBooks){
            this.numberOfBooks = numberOfBooks;
        }
        public int getNumberOfBooks(){
            return numberOfBooks;
        }

        public double totalPrice(int numberOfBooks){
            if (numberOfBooks >=1 &&numberOfBooks <=4){
                return 2000*numberOfBooks;
            }
            if (numberOfBooks >= 5 && numberOfBooks <=9){
                return 1800*numberOfBooks;
            }
            if(numberOfBooks >= 10 && numberOfBooks <= 29){
                return 1600*numberOfBooks;
            }
            return 0.0;
        }
//
//    if(numberOfBooks >= 30 && numberOfBooks <= 50){
//        return 1400*numberOfBooks;
//}
}
