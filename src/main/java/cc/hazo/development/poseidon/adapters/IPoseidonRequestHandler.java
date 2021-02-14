package cc.hazo.development.poseidon.adapters;

public interface IPoseidonRequestHandler {

    /**
     * Made by Chace: 13/02/2021
     * Project: Poseidon
     * Time: 9:20 pm
     * Class: IPoseidonRequestHandler
     */

    void receive(byte[] buf);

    void consume();

    void onReceive();

    byte currentByte();

    void onRequest();

    default void requestOk(PoseidonRequest currentRequest) {
        System.out.println("RECEIVING BYTE: " + currentRequest.CURRENT_BYTE);
    }
}
