import react, {useEffect, useState} from "react";
import TrafficLight from "./TrafficLight";

const CrossRoad=()=>{
    const [vehiclesOnRoads, setVehiclesOnRoad] = useState({})
    const [currentMoves, setCurrentMoves] = useState([])
    const [lights,setLights] = useState({})



    useEffect(()=>{
        fetch("http://localhost:8080/road/current-moves")
            .then(res=>res.json())
            .then(data=>setCurrentMoves(data))
    });

    useEffect(() => {
        fetch("http://localhost:8080/road")
            .then(res=>res.json())
            .then(data=>setVehiclesOnRoad(data))
    }, );



    const renderCars = (amount)=>{
        return Array.from({length: amount || 0}).map((_,index)=>(
            <div key={index} className="vehicle"></div>
        ));
    };

    return (
        <>
            <div className="grid">
                <div className="grass"></div>
                <div className="vertical">
                    <div className="road_element_north">
                        <TrafficLight direction={"north box"}/>
                        {renderCars(vehiclesOnRoads.NORTH)}
                    </div>
                    <div className="road_element" ></div>
                </div>
                <div className="grass"></div>
                <div className="horizontal">
                    <div className="road_element"></div>
                    <div className="road_element_west">
                        <TrafficLight direction={"west box"}/>
                        {renderCars(vehiclesOnRoads.WEST)}
                    </div>
                </div>
                <div className="horizontal">
                    <div className="vertical">
                        <div className="road_element"></div>
                        <div className="road_element"></div>
                    </div>
                    <div className="vertical">
                        <div className="road_element"></div>
                        <div className="road_element"></div>
                    </div>
                </div>
                <div className="horizontal">
                    <div className="road_element_east">
                        <TrafficLight direction={"east box"}/>
                        {renderCars(vehiclesOnRoads.EAST)}
                    </div>
                    <div className="road_element"></div>
                </div>
                <div className="grass"></div>
                <div className="vertical">
                    <div className="road_element"></div>
                    <div className="road_element_south">
                        <TrafficLight direction={"south box"}/>
                        {renderCars(vehiclesOnRoads.SOUTH)}
                    </div>
                </div>
                <div className="grass"></div>
            </div>

        </>
    )
}

export default CrossRoad;