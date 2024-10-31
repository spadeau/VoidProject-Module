package fr.voidnetwork.falcon.centralisation.modules;

import net.md_5.bungee.api.ChatColor;

import java.util.ArrayList;
import java.util.List;

/*
 * Ce code est la propriété exclusive de Void Network.
 * Toute modification du code doit être publique.
 */

public class ModuleManager {

    private final List<Module> modules;

    public ModuleManager() { this.modules = new ArrayList<>(); }

    public synchronized void addModules(Module... modules) {
        for (Module m : modules) this.modules.add(m);
    }

    public synchronized void removeModules(Module... modules) {
        for (Module m : modules) this.modules.remove(m);
    }

    public synchronized void loadModules() {
        for (Module module : modules) {
            System.out.println(ChatColor.GREEN + "[Module] " + module.getName() + " has been loaded.");
            module.onLoad();
        }
    }

    public synchronized List<Module> getModules() { return new ArrayList<>(modules); }
}
