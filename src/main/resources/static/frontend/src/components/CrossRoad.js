import react, {useEffect, useState} from "react";

const CrossRoad=()=>{
    const [vehiclesOnRoads, setVehiclesOnRoad] = useState({})

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
                        {renderCars(vehiclesOnRoads.NORTH)}
                    </div>
                    <div className="road_element" ></div>
                </div>
                <div className="grass"></div>
                <div className="horizontal">
                    <div className="road_element"></div>
                    <div className="road_element_west">
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
                        {renderCars(vehiclesOnRoads.EAST)}
                    </div>
                    <div className="road_element"></div>
                </div>
                <div className="grass"></div>
                <div className="vertical">
                    <div className="road_element"></div>
                    <div className="road_element_south">
                        {renderCars(vehiclesOnRoads.SOUTH)}
                    </div>
                </div>
                <div className="grass"></div>
            </div>

        </>
    )
}

export default CrossRoad;