package Controller;

import View.WorkerView;

public class WorkerManagementSystem {

    public static void main(String[] args) {
        WorkerView view = new WorkerView();
        WorkerController controller = new WorkerController(view);
        controller.run();
    }
}
