#include <stdio.h>

int main() {
	float costPrice, discount, sellingPrice;

	printf("Enter the cost price of the book: ");
	scanf("%f", &costPrice);

	printf("Enter the discount percentage: ");
	scanf("%f", &discount);

	if (costPrice > 0) {
		if (discount >= 0 && discount <= 100) {
			float discountAmount = (costPrice * discount) / 100;
			sellingPrice = costPrice - discountAmount;

			printf("Selling Price of the book = %.2f\n", sellingPrice);
		} else {
			printf("Invalid discount! It must be between 0 and 100.\n");
		}
	} else {
		printf("Invalid cost price! It must be greater than 0.\n");
	}

}
