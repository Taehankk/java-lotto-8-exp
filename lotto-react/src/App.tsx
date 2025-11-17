import style from "./App.module.css";
import AppRouter from "./routes/AppRouter";

function App() {
  return (
    <div className={style.container}>
      <AppRouter />
    </div>
  );
}

export default App;
