import java.util.Scanner;

public class HammingDistance {

	public static int findHammingDistance(int number1, int number2) {
		int numerOfDigitOfNumber1 = findNumberOfDiğit(number1);
		int numerOfDigitOfNumber2 = findNumberOfDiğit(number2);
		int[] array1 = makeDigitArray(number1, numerOfDigitOfNumber1);
		int[] array2 = makeDigitArray(number2, numerOfDigitOfNumber2);
		int distance = 0;

		if (numerOfDigitOfNumber1 == numerOfDigitOfNumber2) {
			for (int i = 0; i < numerOfDigitOfNumber1; i++) {
				if (array1[i] != array2[i]) {
					distance++;
				}
			}

			return distance;
		}

		return 0;
	}

	public static int findNumberOfDiğit(int number) {
		int i = 1, numberOfdigit = 1;

		while (number / i > 9) {

			i = i * 10;
			numberOfdigit++;

		}

		return numberOfdigit;
	}

	public static int[] makeDigitArray(int number, int lenght) {
		int[] digitArray = new int[lenght];

		while (number > 0) {
			digitArray[lenght - 1] = number % 10;
			number = number / 10;
			lenght--;
		}
		return digitArray;
	}

	public static void main(String[] args) {

		int hammingDist;
		
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("please enter first number");
			int firstNumber = input.nextInt();
			System.out.println("please enter second number");
			int secondNumber = input.nextInt();
			hammingDist = findHammingDistance(firstNumber, secondNumber);

			if (hammingDist != 0) {
				System.out.println("Hamming Distance is : " + hammingDist);
			} else {
				System.out.println("Numbers should have equal number of digit");

			}

		} while (hammingDist == 0);
	}
}
