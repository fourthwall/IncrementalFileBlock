package client; /**
 * Created by harrison on 15/07/15.
 */
public class File {
    private int blocksize;

    private int blocknum;
    private Block[] blocks;
    String[] hashes = new String[blocknum];
    protected int blockcounter = 0; //allows blocks to infer their number - must create all blocks in sequence;


    private String Path;
    public File(String path) {
        Path = path;
        blocks = new Block[blocknum]; //initialise and generate block objects that calculate their own hash and number
    }


    public File() {

    }

    public String toString() {
        return hashPath(Path);
    }

    public String[] blockHashes() {
        for (int i = 0; i < blocknum; i++) hashes[i] = blocks[i].hash;
        return hashes;

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
