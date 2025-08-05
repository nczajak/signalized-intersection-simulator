import react from "react";
import '../style/TrafficLight.css';

const TrafficLight = ({direction,colour_status})=>{

    // const red = colour_status[0];
    // const yellow = colour_status[1];
    // const green = colour_status[2];

    return(
        <>
            <div className={direction}>
                <div className="red"></div>
                <div className="yellow"></div>
                <div className="green"></div>
            </div>
        </>
    )
}
export default TrafficLight;