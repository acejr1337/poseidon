package cc.hazo.development.poseidon.adapters;

public class PoseidonRequest {

    /**
     * Made by Chace: 13/02/2021
     * Project: Poseidon
     * Time: 9:25 pm
     * Class: PoseidonRequest
     */

    public int PORT;
    public byte CURRENT_BYTE;

    public float TIMEOUT;

    public boolean CONNECTION_ACTIVE;

    public PoseidonRequest(int port) {
        this.PORT = port;
        this.CONNECTION_ACTIVE = false;
    }

    public void openConnection() {
        CONNECTION_ACTIVE = true;
    }

    public void closeConnection() {
        CONNECTION_ACTIVE = false;
    }

    public void sendRequest(byte[] buf) {
    }

}
