import react, {useEffect, useState} from "react";
import "../style/Roads.css"


const RoadTable =({direction})=>{
    const [vehicles, setVehicles] = useState([])

    useEffect(() => {
        fetch(`http://localhost:8080/road/${direction}`)
            .then(res=>res.json())
            .then(data=>setVehicles(data))
    }, []);

    return(
        <div className="roadTable">
            <div className="tableHeader">{direction.toUpperCase()}</div>
            <div>
                {(vehicles.length > 0) && (
                    <div>
                        {vehicles.map((vehicle, id) => (
                            <div key={id}>
                                <p>{vehicle.vehicleId}: {vehicle.endRoad}</p>
                            </div>
                        ))}
                    </div>
                )}
            </div>
        </div>
    )
}

export default RoadTable;