import { Route, Routes } from "react-router-dom";
import LottoPage from "../pages/LottoPage";

function AppRouter() {
  return (
    <Routes>
      <Route path="/" element={<LottoPage />}></Route>
    </Routes>
  );
}

export default AppRouter;
