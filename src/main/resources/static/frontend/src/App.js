import ActionDisplay from "./components/ActionDisplay";
import NorthRoad from "./components/NorthRoad"
import SouthRoad from "./components/SouthRoad";
import EastRoad from "./components/EastRoad";
import WestRoad from "./components/WestRoad";
import RoadTable from "./components/RoadTable";
import CrossRoad from "./components/CrossRoad";

function App() {

    return(
        <>
            <div className="tables">
                <div>
                    <ActionDisplay />
                </div>
                <div>
                    <CrossRoad/>
                </div>
                <div className="road_tables">
                    <RoadTable direction="north"/>
                    <RoadTable direction="east"/>
                    <RoadTable direction="south"/>
                    <RoadTable direction="west"/>
                </div>
            </div>
        </>

    )
}

export default App;
