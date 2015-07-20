package client;

/**
 * Created by harrison on 15/07/15.
 */
class Block extends File {
    private int offset;
    String hash;
    public Block(int Number) {
        int offset = Number * blocksize;


    }
    String hash()  {
        return null; // call to hashing function here
    }

    byte[] data() throws java.io.IOException {
        byte[] buffer = new byte[blocksize];
        input.read(buffer, offset, blocksize);
        return buffer;
    }

}
