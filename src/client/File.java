package client; /**
 * Created by harrison on 15/07/15.
 */

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class File {
    InputStream input;
    protected int blocksize = 50000; //size in bytes, later to be adjustable, potentially dynamically

    private Block[] blocks;
    String[] hashes;

    public File(String path) throws FileNotFoundException  {
        int numofblocks;
        input = new BufferedInputStream(new FileInputStream(path));
        long length = new java.io.File(path).length();
        if (length / blocksize == length % blocksize) {
            numofblocks = (int) length % blocksize ;
        }
        else numofblocks = (int) ((new java.io.File(path).length() % blocksize) + 1); //this actually makes me cry
        //then initialise hashes with the calculated blocknum
        // then instantiate block array
        blocks = new Block[numofblocks];
        for (int i = 0; i < numofblocks; i++)  blocks[i] = new Block(i) ; //initialise and generate block objects that calculate their own hash and number
        //get hashes of all blocks
        hashes = new String[numofblocks];
        for (int i = 0; i < numofblocks; i++) hashes[i] = blocks[i].hash;
    }


    public File() {

    }

    private String hashblock(int block) {
        //TBC
        return null;
    }

    private static String hashPath(String Path) {
        return null;
    }

    public Block[] getBlocks(int[] blocksreq) { //get an array of blocks from an integer array containing the desired block numbers
        Block[] blockArr = new Block[blocksreq.length];
        for (int i = 0; i < blocksreq.length; i++) {
            blockArr[i] = blocks[blocksreq[i]];
        }
        return blockArr;

    }


}
