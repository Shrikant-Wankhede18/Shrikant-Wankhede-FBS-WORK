#include <stdio.h>
#include <string.h>

typedef struct {
    int id;
    char name[50];
    float price;
    int quantity;
} Product;

void displayProducts(Product products[], int n) {
    printf("\nAvailable Products:\n");
    printf("ID\tName\t\tPrice\tStock\n");
    printf("------------------------------------\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%-10s\t%.2f\t%d\n", products[i].id, products[i].name, products[i].price, products[i].quantity);
    }
}

float addToCart(Product products[], int n) {
    int id, qty;
    float total = 0;
    
    while (1) {
        printf("\nEnter Product ID to add to cart (0 to finish): ");
        scanf("%d", &id);
        
        if (id == 0) break;
        
        int found = 0;
        for (int i = 0; i < n; i++) {
            if (products[i].id == id) {
                found = 1;
                printf("Enter quantity: ");
                scanf("%d", &qty);
                
                if (qty <= products[i].quantity) {
                    total += qty * products[i].price;
                    products[i].quantity -= qty;
                    printf("Added %d x %s to cart. Subtotal: %.2f\n", qty, products[i].name, total);
                } else {
                    printf("Sorry, only %d in stock.\n", products[i].quantity);
                }
                break;
            }
        }
        if (!found) {
            printf("Invalid Product ID.\n");
        }
    }
    return total;
}

void main() {
    Product products[5] = {
        {1, "Apple", 10.5, 20},
        {2, "Banana", 5.0, 30},
        {3, "Milk", 40.0, 15},
        {4, "Bread", 25.0, 10},
        {5, "Eggs", 6.0, 50}
    };
    
    int n = 5;
    float totalCost = 0;
    
    printf("===== Welcome to Point of Sale System =====\n");
    
    displayProducts(products, n);
    totalCost = addToCart(products, n);
    
    printf("\nFinal Total = %.2f\n", totalCost);
    printf("===== Thank you for shopping! =====\n");
    
    
}
