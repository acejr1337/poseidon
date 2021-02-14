package cc.hazo.development.poseidon.adapters;

public class PoseidonRequestHandler implements IPoseidonRequestHandler{

    /**
     * Made by Chace: 13/02/2021
     * Project: Poseidon
     * Time: 9:16 pm
     * Class: PoseidonRequestHandler
     */

    private PoseidonRequest poseidonRequest;
    private byte currentByte;
    public boolean connectionActive;

    public PoseidonRequestHandler() {
        this.poseidonRequest = new PoseidonRequest(5876);
        this.currentByte = poseidonRequest.CURRENT_BYTE;
        this.connectionActive = poseidonRequest.CONNECTION_ACTIVE;
    }

    @Override
    public void receive(byte[] buf) {
        poseidonRequest.sendRequest(buf);
    }

    @Override
    public void consume() {
    }

    @Override
    public void onReceive() {
    }

    @Override
    public byte currentByte() {
        return poseidonRequest.CURRENT_BYTE;
    }

    @Override
    public void onRequest() {
    }
}
