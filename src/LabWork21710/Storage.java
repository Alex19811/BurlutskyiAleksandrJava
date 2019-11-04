package LabWork21710;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Storage {

    public static ConcurrentHashMap<String,String> cmap = new ConcurrentHashMap<>(16,0.75f,2);
    public static HashMap<String,String> map = new HashMap<>();

}