package cc.hazo.development.poseidon;

import cc.hazo.development.poseidon.adapters.PoseidonRequestHandler;
import com.sun.deploy.net.proxy.ProxyUnavailableException;

import java.io.IOException;

public class Poseidon {

    /**
     * Made by Chace: 13/02/2021
     * Project: Poseidon
     * Time: 9:14 pm
     * Class: Poseidon
     */

    /**
     * I love talking to myself in code.
     */

    private PoseidonRequestHandler poseidonRequestHandler;

    public Poseidon() {
        this.poseidonRequestHandler = new PoseidonRequestHandler();
    }

    public static void main(String[] args) {
        new Poseidon();
    }

    public synchronized void openConnection(PoseidonRequestHandler connectionHandler) throws IOException, ProxyUnavailableException {
    }

    public void closeConnection(PoseidonRequestHandler connectionHandler) throws IOException, ProxyUnavailableException {
    }

    public PoseidonRequestHandler getConnection() {
        return poseidonRequestHandler;
    }

    public boolean isConnectionActive() {
        return poseidonRequestHandler.connectionActive;
    }

}
