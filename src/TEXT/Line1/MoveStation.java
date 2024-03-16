package TEXT.Line1;

public class MoveStation {
    public String Name;
    public int Code;
    public int Line;

    public void CreateStation(String StationName, int StationCode, int LineNo) {
        Name = StationName;
        Code = StationCode;
        Line = LineNo;
    }

    public void moveRight(int nextStation) {
        CurrentStation.CurrentStationId = nextStation;
    }

    public void moveLeft(int nextStation) {
        CurrentStation.CurrentStationId = nextStation;
    }

    public void moveLineUP(int nextStation, int nextStationLine) {
        CurrentStation.CurrentStationId = nextStation;
        CurrentStation.CurrentStationLine = nextStationLine;
    }

    public void moveLineDown(int nextStation, int nextStationLine) {
        CurrentStation.CurrentStationId = nextStation;
        CurrentStation.CurrentStationLine = nextStationLine;
    }

}
