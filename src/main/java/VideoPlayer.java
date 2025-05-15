class VideoPlayer implements Player {
    
    protected boolean onOff;
    protected String video;
    protected int currentTime;
    protected int volume;

    public VideoPlayer(String video) {
        this.video=video;
        this.volume=0;
        this.onOff=false;
        this.currentTime=0;
    }

    public void start() {
        if (this.onOff==false) {
            this.onOff=true;
        }
    }

    public void stop() {
        if (this.onOff==true) {
            this.onOff=false;
        }
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume=this.volume+5;
    }

    public void volumeDown() {
        this.volume=this.volume-5;
    }

    public int getVolume() {
        return this.volume;
    }

    public void fastForward() {
        this.currentTime=this.currentTime+5;
    }

    public void rewind() {
        this.currentTime=this.currentTime-5;
    }

    public int getCurrentTime() {
        return this.currentTime;
    }

    public String getVideo() {
        return this.video;
    }

    public void setVideo(String video) {
        this.video=video;
    }
}
