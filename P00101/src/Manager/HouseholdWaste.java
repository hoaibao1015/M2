package Manager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import Common.Library;
import Model.Pay;
import Model.TransferStation;
import Model.Truck;
import Views.Menu;

public class HouseholdWaste extends Menu<String> {

    static String[] options = {"cacl", "exit"};
    ArrayList<TransferStation> dataTS = new ArrayList<>();
    Truck truck = new Truck();
    Pay pay = new Pay();
    double total;
    Library library = new Library();

    public HouseholdWaste() {
        super("  Collecting household waste  ", options);
    }

    @Override
    public void execute(int n) throws FileNotFoundException, IOException {
        switch (n) {
            case 1:
                ArrayList<String> dataTS = library.readStringList();
                library.processInputData(dataTS, truck, pay);
                break;

            case 2:
                System.exit(0);
                break;
        }
    }
}
