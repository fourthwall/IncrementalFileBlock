package com.company; /**
 * Created by harrison on 15/07/15.
 */
import java.math.*;
public class File {
    private int blocksize;
    private int blocknum;
    private String Path;
    public File(String path) {
        Path = path;

    }
    public String toString() {
        return hashPath(Path);
    }

    public String[] getBlockHashes() {
        String[] hashes = new String[blocknum];
        for (int i = 0; i < blocknum; i++) {
            hashes[i] = hashblock(i);
        }
        return hashes;

    }

    private String hashblock(int block) {
        //TBC
        return null;
    }

    private static String hashPath(String Path) {
        return null;
    }

}
