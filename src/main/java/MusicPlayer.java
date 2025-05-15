class MusicPlayer implements Player {

    protected boolean onOff;
    protected String[] musicList;
    protected String currentSong;
    protected int volume;

    public MusicPlayer(String[] musicList) {
        this.musicList = musicList;
        this.volume = 0;
        this.onOff = false;
        currentSong = "";
    }

    public void start() {
        if (this.onOff==false) {
            onOff=true;
        }
        this.currentSong=this.musicList[0];
    }

    public void stop() {
        if (this.onOff==true) {
            onOff=false;
        }
        this.currentSong="";
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume++;
    }

    public void volumeDown() {
        this.volume--;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        int index=-1;
        for (int i=0; i<this.musicList.length; i++) {
            if (this.musicList[i]==this.currentSong) {
                index = i;
                i=this.musicList.length;
            }
        }
        this.currentSong=this.musicList[index+1];
    }

    public void previous() {
        int index=-1;
        for (int i=0; i<this.musicList.length; i++) {
            if (this.musicList[i]==this.currentSong) {
                index = i;
                i=this.musicList.length;
            }
        }
        this.currentSong=this.musicList[index-1];
    }

    public String getCurrentSong() {
        return currentSong;
    }
}