import react, {useEffect, useState} from "react";
import "../style/Roads.css"


const NorthRoad=()=>{

    const [vehicles, setVehicles] = useState([])

    useEffect(() => {
        fetch("http://localhost:8080/road/north")
            .then(res=>res.json())
            .then(data=>setVehicles(data))
    }, []);

    return(
        <>
            <div className="vertical_road">
                <div>
                    {(vehicles.length > 0) && (
                        <div>
                            {vehicles.map((vehicle, id) => (
                                <div key={id}>
                                    <p>{vehicle.vehicleId}</p>
                                    <p>{vehicle.waitingTime}</p>
                                    <p>{vehicle.endRoad}</p>
                                </div>
                            ))}
                        </div>
                    )}
                </div>
            </div>
        </>
    )
}

export default NorthRoad;