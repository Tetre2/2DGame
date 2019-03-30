package Level_Desine.Model;

import Level_Desine.Type;

import java.util.ArrayList;
import java.util.List;

public class Types {

    private List<Type> Brick_Walls;
    private List<Type> Brick_Doors;
    private List<Type> Floors;

    public Types() {
        Brick_Walls = new ArrayList<>();
        Brick_Doors = new ArrayList<>();
        Floors = new ArrayList<>();

        Brick_Walls.add(Type.Brick_Wall_1);
        Brick_Walls.add(Type.Brick_Wall_2);
        Brick_Walls.add(Type.Brick_Wall_3);
        Brick_Walls.add(Type.Brick_Wall_4);


    }

    public List<Type> getBrickWallTypes(){
        return Brick_Walls;
    }





}
