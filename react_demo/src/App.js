import logo from './logo.svg';
import { Beans } from './Components/Beans'
import './App.css';

// look a function component!
// could give it age instead of manually giving it
function App() {
  return (
    // call Beans, give it a name
    // need to use curly braces for anything other than string, should use for everything
    <div className="App">
      <Beans name="Mr. Bean" age={40}/>
      <SomeText />
      <SomeText />
      <SomeText />
    </div>
  );
}

// Add some text!
function SomeText() {
  return <p>hello, this is some text!</p>

}

export default App;
