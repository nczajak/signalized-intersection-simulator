import ActionDisplay from "./components/ActionDisplay";
import NorthRoad from "./components/NorthRoad"
import SouthRoad from "./components/SouthRoad";
import EastRoad from "./components/EastRoad";
import WestRoad from "./components/WestRoad";

function App() {

    return(
        <>
            <ActionDisplay />
            <div className="crossroad">
                <div className="vertical_roads">
                    <NorthRoad />
                    <SouthRoad/>
                </div>
                <div className="horizontal_roads">
                    <EastRoad/>
                    <WestRoad/>
                </div>
            </div>
        </>

    )
}

export default App;
