package StringBui8lderDelete;
//consrteuct a string builder initializeds to the content of the specific string.
//The intital capicity of the string builder is 16 plus the length of the string argument.

public class Wek4_meeting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuilder stringBuilder = new StringBuilder("I ate 100 blue berries.");



//display the string builder object

System.out.println(stringBuilder);



//Delete the '0'
stringBuilder.deleteCharAt(8);
System.out.println(stringBuilder);

//checking where you are at


//deleting word blue
stringBuilder.delete(9, 13);
System.out.println(stringBuilder);


stringBuilder.setCharAt(6,'5');
	}

}
