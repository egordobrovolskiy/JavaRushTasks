package com.javarush.task.task30.task3008.client;

public class ClientGuiController extends Client {

    public static void main(String[] args) {
        ClientGuiController guiController = new ClientGuiController();
        guiController.run();
    }

    private ClientGuiModel model = new ClientGuiModel();
    private ClientGuiView view = new ClientGuiView(this);

    protected SocketThread getSocketThread() {
        return new GuiSocketThread();
    }

    protected String getServerAddress() {
        return view.getServerAddress();
    }
    protected int getServerPort() {
        return view.getServerPort();
    }
    protected String getUserName() {
        return view.getUserName();
    }
    public ClientGuiModel getModel() {
        return model;
    }

    public void run() {
        getSocketThread().run();

    }


    public class GuiSocketThread extends SocketThread {
        @Override
        protected void processIncomingMessage(String message) {
            model.setNewMessage(message);
            view.refreshMessages();
        }

        @Override
        protected void informAboutAddingNewUser(String userName) {
            model.addUser(userName);
            view.refreshUsers();
        }

        @Override
        protected void informAboutDeletingNewUser(String userName) {
            model.deleteUser(userName);
            view.refreshUsers();
        }

        @Override
        protected void notifyConnectionStatusChanged(boolean clientConnected) {
            view.notifyConnectionStatusChanged(clientConnected);
        }

    }
}
