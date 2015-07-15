package client;

/**
 * Created by harrison on 15/07/15.
 */
public class Block extends File {
    //incremement the number of blocks spawned for this file and take the current one as the block number
    private int number;
    protected String hash;
    public Block() {
        number = blockcounter++;

    }

}
