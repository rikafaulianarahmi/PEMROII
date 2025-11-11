package CLI;

class MainMenuPage extends BasePage {
    private PageNavigator navigator;

    public MainMenuPage(InputHandler inputHandler, OutputHandler outputHandler, PageNavigator navigator) {
        super(inputHandler, outputHandler);
        this.navigator = navigator;
    }

    @Override
    public void display() {
        displayHeader("MAIN MENU");
        outputHandler.println("1. User Input Page");
        outputHandler.println("2. Display Information");
        outputHandler.println("3. Exit");
        outputHandler.print("\nSelect option: ");
    }

    @Override
    public void handleInput() {
        int choice = inputHandler.readInt();

        switch (choice) {
            case 1:
                navigator.navigateTo("input");
                break;
            case 2:
                navigator.navigateTo("display");
                break;
            case 3:
                exitFlag = true;
                outputHandler.println("\nThank you for using the application!");
                break;
            default:
                outputHandler.println("\nInvalid option. Please try again.");
        }
    }
}
