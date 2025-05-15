class RadioPlayer implements Player {
    
    protected boolean onOff;
    protected double[] stationList;
    protected int volume;
    protected double station;

    public RadioPlayer(double[] stationList) {
        this.stationList=stationList;
        this.volume=0;
        this.onOff=false;
        this.station=0;
    }

    public void start() {
        if (this.onOff==false) {
            this.onOff=true;
        }
        this.station=this.stationList[0];
    }

    public void stop() {
        if (this.onOff==true) {
            this.onOff=false;
        }
        this.station=0;
    }

    public boolean getOnOff() {
        return this.onOff;
    }

    public void volumeUp() {
        this.volume=this.volume+2;
    }

    public void volumeDown() {
        this.volume=this.volume-2;
    }

    public int getVolume() {
        return this.volume;
    }

    public void next() {
        int index=-1;
        for (int i=0; i<this.stationList.length; i++) {
            if (this.stationList[i]==this.station) {
                index = i;
                i=this.stationList.length;
            }
        }
        this.station=this.stationList[index+1];
    }

    public void previous() {
        int index=-1;
        for (int i=0; i<this.stationList.length; i++) {
            if (this.stationList[i]==this.station) {
                index = i;
                i=this.stationList.length;
            }
        }
        this.station=this.stationList[index-1];       
    }

    public double getStation() {
        return this.station;
    }
}
