package fr.voidnetwork.falcon.centralisation.modules;

/*
 * Ce code est la propriété exclusive de Void Network.
 * Toute modification du code doit être publique.
 */

public interface Module {
    String getName();
    void onLoad();

    default void log(String prefix, String message) {
        if(!prefix.isEmpty()){
            System.out.println("[" + prefix + "] " + message);
        } else {
            System.out.println(message);
        }
    }
}
