import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables for book
        int id = 0;
        String name = "";
        String author = "";
        String cat = "";
        int total = 0;
        int available = 0;

        boolean added = false; // to check if book is added or not

        int ch = 0;

        while (ch != 8) {
            System.out.println("");
            System.out.println("1. Add Book");
            System.out.println("2. View Book");
            System.out.println("3. Search Book");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. Delete Book");
            System.out.println("7. Library Report");
            System.out.println("8. Exit");
            System.out.print("Enter choice: ");
            ch = sc.nextInt();

            if (ch == 1) {
                System.out.print("Enter Book ID: ");
                id = sc.nextInt();
                sc.nextLine();
                System.out.print("Enter Book Name: ");
                name = sc.nextLine();
                System.out.print("Enter Author Name: ");
                author = sc.nextLine();
                System.out.print("Enter Category: ");
                cat = sc.nextLine();
                System.out.print("Enter Total Copies: ");
                total = sc.nextInt();

                available = total; // available copies same as total in start
                added = true;

                System.out.println("Book Added.");
            }

            else if (ch == 2) {
                if (added == false) {
                    System.out.println("No Book Available");
                }
                else {
                    System.out.println("Book ID: " + id);
                    System.out.println("Book Name: " + name);
                    System.out.println("Author: " + author);
                    System.out.println("Category: " + cat);
                    System.out.println("Total Copies: " + total);
                    System.out.println("Available Copies: " + available);
                }
            }

            else if (ch == 3) {
                if (added == false) {
                    System.out.println("No Book Available");
                }
                else {
                    System.out.print("Enter Book ID to search: ");
                    int sid = sc.nextInt();

                    if (sid == id) {
                        System.out.println("Book Found");
                        System.out.println("Name: " + name);
                        System.out.println("Author: " + author);
                    }
                    else {
                        System.out.println("Book Not Found");
                    }
                }
            }

            else if (ch == 4) {
                if (added == false) {
                    System.out.println("Book Not Available");
                }
                else if (available > 0) {
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();

                    available = available - 1;
                    System.out.println("Book Issued to Student ID: " + sid + ".");
                }
                else {
                    System.out.println("Book Not Available");
                }
            }

            else if (ch == 5) {
                if (added == false) {
                    System.out.println("No Book Available");
                }
                else {
                    available = available + 1;
                    System.out.println("Book Returned.");
                }
            }

            else if (ch == 6) {
                // reset everything
                id = 0;
                name = "";
                author = "";
                cat = "";
                total = 0;
                available = 0;
                added = false;

                System.out.println("Book Deleted.");
            }

            else if (ch == 7) {
                if (added == false) {
                    System.out.println("No Book Available");
                }
                else {
                    int issued = total - available;
                    System.out.println("Book ID: " + id);
                    System.out.println("Book Name: " + name);
                    System.out.println("Total Copies: " + total);
                    System.out.println("Available Copies: " + available);
                    System.out.println("Issued Copies: " + issued);
                }
            }

            else if (ch == 8) {
                System.out.println("Thank You");
            }

            else {
                System.out.println("Wrong choice, try again");
            }
        }

        sc.close();
    }
}