package com.zipcodewilmington.assessment2.part2;

import java.util.*;

public class Router {
    LinkedHashMap<String, String> router;
    private int routerSize = 0;

    public Router() {
        router = new LinkedHashMap<>();

    }

    public int size() {
        return this.routerSize;
    }

    public void add(String path, String controller) {
        this.router.put(path, controller);
        incrementRouterSize();
    }

    public void incrementRouterSize() {
        this.routerSize++;
    }
    public void decrementRouterSize() {
        this.routerSize--;
    }

    public String getController(String path) {
        return this.router.get(path);
    }

    public void update(String path, String studentController) {
        this.add(path, studentController);
    }

    public void remove(String path) {
        this.router.remove(path);
        decrementRouterSize();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        ArrayList<String> routerKeys = new ArrayList<>(router.keySet());
        Collections.reverse(routerKeys);

        for(String key: routerKeys) {
            sb.append(key + " -> " + this.router.get(key) + "\n");
        }

        return sb.toString();
    }
}
