package Main;
public class BeerSong {
public static void main (String[] args) {
int beerNum = 99;
String word = "bottles";

while (beerNum>0) {
	if (beerNum ==1){
		 word = "bottle"; // no singular como em UMA garrafa.	 
	}
	System.out.println(beerNum+" "+word+" "+"of beer on the wall");
	System.out.println(beerNum+" "+word+" "+"of beer.");
	System.out.println("Take one down.");
	System.out.println("Pass it around.");
	beerNum --;

	if (beerNum>0) {
		if (beerNum ==1){
			word = "bottle";
		}	 
		System.out.println(beerNum+" "+word+" "+"of beer on the wall\n");
	}else {
		System.out.println("No more bottles of beer on the wall.\n");
		System.out.println("No more bottles of beer on the wall.");
		System.out.println("no more bottles of beer.");
		System.out.println("Go to the store and buy some more, \n99 bottles of beer on the wall.");
	} // fim do else
} // fim do loop while
} // fim do método main
} // fim da classe

